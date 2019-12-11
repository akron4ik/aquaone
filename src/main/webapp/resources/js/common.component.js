import {BaseComponent} from "./base/base.component.js";
import {ProductsComponent} from "./product/products-catalog.component.js";
import {ShopService} from "./service.component.js";
import {UsersComponent} from "./users/user.component.js";

export class CommonComponent extends BaseComponent{
    constructor({element}) {
        super({element});
        this._render();
        this._initProducts();
        this._initUsers();

        this
            .on('click', '.btn1', (e) => {
                const url = e.delegatedTarget.dataset;
                console.log(url);
                this.emit('show-products', url)
            })
            .on('click', '.btn2', (e) => {
                const url = e.delegatedTarget.dataset;
                console.log(url);
                this.emit('show-users', url)
            })
            .subscribe('show-products', ({detail: url}) => {
               this._showUnit(url);
            })
            .subscribe('show-users',({detail: url}) => {
               this._showUnit(url);

            });

    }


    _initProducts(){
        this._catalog = new ProductsComponent({
            element: this._element.querySelector('.products-catalog'),
        });
    }

    _initUsers(){
        this._users = new UsersComponent({
            element: this._element.querySelector('.users'),
        });
    }

    async _showUnit(url){
        let {show} = url;
        try {
            const units = await ShopService.getAll({url: show});

            if(show.includes("users")){
                this._users.show(units);
                return;
            }
            this._catalog.show(units);
        }
        catch (err) {
            console.log(err);
        }
    }

    _render() {

        this._element.innerHTML = `
            <div class="row">
      <!--Sidebar-->
      <div class="col-md-2">
        <section class="phones-filter"></section>

       <section class="cart"></section>
      </div>

      <!--Main content-->
      <div class="col-md-10">
        <div class="products-catalog">
        <button class="btn1" data-show="http://localhost:8080/admin/products">Products</button>
        </div>
        <div class="users">
        <button class="btn2" data-show="http://localhost:8080/rest/admin/users">Users</button>
</div>
      </div>
    </div>
        
        `
    }


}