import {BaseComponent} from "../base/base.component.js";

export class UsersComponent extends BaseComponent {
    constructor({element, users}) {
        super({element});
        this._users = users;

    }

    show(users){
        this._users = users;
        this._render();
        super.show();
    }

    _render() {

        this._element.innerHTML = `
           <ul class="phones">
           ${this._users.map((user) => {
            return ` <li class="thumbnail">
                         
                               
                         <p>${user.name}</p>
                          <p>${user.phone}</p>
                           <p>${user.address}</p>
                         
                     </li>
           `
        }).join('')}
        </ul>
        
        `
    }
}