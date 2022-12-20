function addItem(){
    //ul 요소 가져옴
    let list = document.getElementById('todolist');
    //input요소 가져옴
    let todo = document.getElementById('item');
    let listitem = document.createElement('li')
    let xbtn = document.createElement("button");

    listitem.className = 'list-group-item list-group-item-action list-group-item-warning';
    xbtn.className = "close";
    xbtn.innerHTML = "%times;";
    
}