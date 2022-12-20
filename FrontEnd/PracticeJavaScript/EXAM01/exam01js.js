window.addEventListener("load",function(){
    let sectionKing = document.querySelector("#section01");
    let buttonController = sectionKing.querySelector("#button1");
    let text=sectionKing.querySelector("text1");
    let imageSrc = sectionKing.querySelector("#s")
    buttonController.onclick = function(){
        imageSrc.src = "./IMGS/"+text.value+".jpg"
        
    }

});