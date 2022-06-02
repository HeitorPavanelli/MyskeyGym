
import { validarCPF } from "./validarCPF.js";
import {validarCEP} from "./validarCEP.js"
import { mensagensDeErro } from "./constants/mensagensDeErro.js";
import { tiposDeErro } from "./constants/tiposDeErros.js";

const retornarMensagemErro = (tipo, validity) => {
    let mensagemDeErro = "";
  
    tiposDeErro.forEach(erro => {
      if (validity[erro]) {
        mensagemDeErro = mensagensDeErro[tipo][erro];
      }
    });
    return mensagemDeErro;
  };
  
  export const validarInput = (input, adicionarErro = true) => {
    const classeElementoErro = "erro-validacao";
    const elementoPai = input.parentNode;
    const elementoErroExiste = elementoPai.querySelector(
      `.${classeElementoErro}`
    );
    const elementoErro = elementoErroExiste || document.createElement("p");
    const classeInputErro = "possui-erro-validacao";
    const tipo = input.dataset.tipo;
    const elementoEhValido = input.validity.valid;
    const validadoresEspecificos = {
      cep: input => validarCEP(input),
      cpf: input => validarCPF(input)
      
    };
  
    if (validadoresEspecificos[tipo]) {
      validadoresEspecificos[tipo](input);
    }
  
    // elemento não é valido
    if (!elementoEhValido) {
      elementoErro.className = classeElementoErro;
      elementoErro.textContent = retornarMensagemErro(
        input.dataset.tipo,
        input.validity
      );
  
      if (adicionarErro) {
        input.after(elementoErro);
        input.classList.add(classeInputErro);
      }
    } else {
      // elemento é valido
      input.classList.remove(classeInputErro);
      elementoErro.remove();
    }
}