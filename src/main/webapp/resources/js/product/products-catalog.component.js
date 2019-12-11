import {BaseComponent} from "../base/base.component.js";


export class ProductsComponent extends BaseComponent{
    constructor({element}) {
    super({element});
    this._products = [];

    }


    show(products){
        this._products = products;
        this._render();
        super.show();
    }

    _render() {

        this._element.innerHTML = `
           <ul class="phones">
           ${this._products.map((product) => {
            return ` <li class="thumbnail">
                         
                               
                         <p>${product.name}</p>
                     </li>
           `
        }).join('')}
        </ul>
        
        `
    }


}



/*function enable(chkbox, id) {
    const enabled = chkbox.is(":checked");
//  https://stackoverflow.com/a/22213543/548473
    $.ajax({
        url: userAjaxUrl + id,
        type: "POST",
        data: "enabled=" + enabled
    }).done(function () {
        chkbox.closest("tr").attr("data-userEnabled", enabled);
        successNoty(enabled ? "common.enabled" : "common.disabled");
    }).fail(function () {
        $(chkbox).prop("checked", !enabled);
    });
}*/

// $(document).ready(function () {
/*
$(function () {
    makeEditable({
            ajaxUrl: userAjaxUrl,
            datatableOpts: {
                "columns": [
                    {
                        "data": "name"
                    },
                    {
                        "data": "description",
                    },
                    {
                        "orderable": false,
                        "defaultContent": "",
                        "render": renderEditBtn
                    },
                    {
                        "orderable": false,
                        "defaultContent": "",
                        "render": renderDeleteBtn
                    }
                ],
                "order": [
                    [
                        0,
                        "asc"
                    ]
                ],
               /!* "createdRow": function (row, data, dataIndex) {
                    if (!data.enabled) {
                        $(row).attr("data-userEnabled", false);
                    }
                }*!/
            },
            updateTable: function () {
                $.get(userAjaxUrl, updateTableByData);
            }
        }
    );
});*/
