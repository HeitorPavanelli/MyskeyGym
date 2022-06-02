function mostrarOcultarSenha(){
    var senha = document.getElementById("senha_cad");
    if(senha.type == "password"){
        senha.type="text";
    }else{
        senha.type="password";
    }
};