const BASE_URL = 'http://localhost:8080';
export const ShopService = new class {
    constructor() {
        console.log('init ShopService');
    }

    async getAll({url} = {}) {
        /*return await this._sendRequest(`${url}`);*/
        return new Promise((res, rej)=>{
            const xhr = new XMLHttpRequest();
            xhr.open('GET', url, false);
            xhr.addEventListener('load', ()=> {
                console.log(xhr);
                if(xhr.status !== 200) {
                    console.log(xhr.status, xhr.statusText);
                    return rej({status: xhr.status, error: xhr.statusText});
                }
                res(JSON.parse(xhr.responseText));
            });
            xhr.send();

        });
    }

    /*getOneById(id){
        /!*return new Promise((res, rej)=>{
            const xhr = new XMLHttpRequest();
            xhr.open('GET', `/phones/${id}.json`, false);
            xhr.addEventListener('load', ()=> {
                console.log(xhr);
                if(xhr.status !== 200) {
                    console.log(xhr.status, xhr.statusText);
                    return rej({status: xhr.status, error: xhr.statusText});
                }
                res(JSON.parse(xhr.responseText));
            });
            xhr.send();

        });*!/
        return this._sendRequest(`/phones/${id}.json`);

    }*/

    async _sendRequest(url, {method = 'GET'} = {}){
        const res = await fetch(`${BASE_URL}${url}`, {
            method,
            headers:[
               /* ['Authorization', 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6Imlnb3IiLCJpYXQiOjE1NjQxMzY0Nzd9.bgLlbxJjFs7OKLLu3FhboCqKXDDT4VZiCZNofjvWw68'],*/
                ['Content-type', 'application/json'],
            ]
        } );
        if(res.status !== 200){
            throw new Error(res.statusText);
        }
        return res.json();


    }
    _search(phones, searchText){
        if(!searchText){
            return phones;
        }
        return phones.filter((phone)=> phone.name.toLowerCase().includes(searchText.toLowerCase()));
    }
    _sort(phones, orderBy){
        if(!orderBy){
            return phones;
        }
        phones.sort((phone1, phone2)=>{
            if(phone1[orderBy] > phone2[orderBy]){
                return 1;
            }
            if(phone1[orderBy] < phone2[orderBy]){
                return -1;
            }
            return 0;
        })
        return phones;
    }
};
