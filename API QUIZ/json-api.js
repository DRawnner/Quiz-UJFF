const https = require('https');
var convert = require('xml-js');
const fs = require('fs');
var request = require('request');


request.post('http://localhost:8080', {
  json:
    {"quiz": [
      { "pergunta": "Quem foi o conde D`Essex?", "opcao1": "Monarca que residia na cidade","opcao2": "Primeiro presidente da Junta","opcao3": "Corsário Inglês que destruiu Faro","opcao4": "Governador da Região", "resposta": "Corsário Inglês que destruiu Faro"},

      { "pergunta": "Em que ano ocorreu a unificação das juntas de freguesia da Sé e São Pedro?", "opcao1": "2017","opcao2": "2013","opcao3": "2009","opcao4": "2005", "resposta": "2013"},

      { "pergunta": "Qual o Rei que elevou Faro a cidade?", "opcao1": "D. Afonso III", "opcao2":"D. João III","opcao3":"D. Dinis","opcao4":"D. Manuel", "resposta": "D. João III"},

      { "pergunta": "Em que ano foi inaugurado o Arco da Vila?", "opcao1": "1812","opcao2":"1540","opcao3":"1674","opcao4":"1250", "resposta": "1812"},

      { "pergunta": "Qual o nome do presidente da União das Freguesias de Faro?", "opcao1": "Jorge Jesus","opcao2": "Jorge Pereira","opcao3": " José Inácio","opcao4": " Bruno Lage", "resposta": " Bruno Lage"},

      { "pergunta": "Em que mês ocorre a Feira do Doce Regional e Conventual de Faro?", "opcao1": "Agosto","opcao2": "Julho","opcao3": "Abril","opcao4": "Dezembro", "resposta": "Agosto"},

      { "pergunta": "Se estivermos a navegar pelos canais da Ria Formosa, qual a distância aproximada entre o caís das Portas do Mar (Faro) e o caís da Culatra?", "opcao1": " 7 km ","opcao2": "9 km","opcao3": "12 km ","opcao4": "5 km", "resposta": "9 km"},

      { "pergunta": "Em que ano ocorreu a unificação das juntas de freguesia da Sé e São Pedro?", "opcao1": "2017","opcao2": "2013","opcao3": "2009","opcao4": "2005", "resposta": "2013"},

      { "pergunta": "De acordo com os Censos 2011 qual o número aproximado de habitantes na Freguesia?Qual a área aproximada da União das Freguesias de Faro?", "opcao1": "152 km2","opcao2": "108 km2","opcao3": "73 km2","opcao4": "45 km2", "resposta": "73 km2"},

      { "pergunta": "Em que mês ocorre habitualmente a Feira dos Queijos, Vinhos e Enchidos?", "opcao1": "Agosto","opcao2": "Novembro","opcao3": "Junho","opcao4": "Abril", "resposta": "Abril"},

      { "pergunta": "Em que ano foi inaugurado o Hospital Distrital de Faro (atualmente Centro Hospitalar Universitário do Algarve)?", "opcao1": "1935","opcao2": "1995","opcao3": "1979","opcao4": "1919", "resposta": "1979"},

      { "pergunta": "A Ria Formosa é constituída por duas penínsulas e várias ilhas barreira. Quantas dessas ilhas fazem parte do território da freguesia?", "opcao1": "1","opcao2": "3","opcao3": "2","opcao4": "4", "resposta": "2"},

      { "pergunta": "Em que ano Faro foi conquistado aos Mouros?", "opcao1": "1249","opcao2": "970","opcao3": "1110","opcao4": "1500", "resposta": "1249"},

      { "pergunta": "A União das Freguesias de Faro tem uma área aproximada de:", "opcao1": "3 de dezembro de 2003 ","opcao2": "7 de setembro de 2010","opcao3": "8 de Fevereiro de 2007 ","opcao4": " 6 de junho de 1998", "resposta": "8 de Fevereiro de 2007 "},

      { "pergunta": "Quantos lugares de estacionamento tem o Largo de São Francisco? Quem é o atual presidente da Câmara Municipal de Faro?", "opcao1": "José Vitorino","opcao2": "António Costa","opcao3": "José Inácio ","opcao4": "Rogério Bacalhau", "resposta": "Rogério Bacalhau"},

      { "pergunta": "O Sport Faro e Benfica a filial do Sport Lisboa e Benfica número:", "opcao1": "2","opcao2": "1","opcao3": "5","opcao4": "10", "resposta": "1"},

      { "pergunta": "Qual é o Santo Padroeiro da cidade de Faro?", "opcao1": "São Pedro","opcao2": "São Tomás de Aquino","opcao3": "São Francisco de Assis ","opcao4": "Santo António", "resposta": "São Tomás de Aquino"},

      { "pergunta": "Qual a nacionalidade do arquiteto que projetou o Arco da Vila?", "opcao1": "Sueca","opcao2": "Francesa","opcao3": "Portuguesa","opcao4": "Italiana", "resposta": "Italiana"},

      { "pergunta": "Em que ano ocorreu o terramoto e tsunami que assolou a cidade de Faro?", "opcao1": "1565","opcao2": "1942","opcao3": "1755","opcao4": "1842", "resposta": "1755"},

      { "pergunta": "Em que dia foi inaugurada a Estação Ferroviária de Faro?", "opcao1": "1 de julho de 1889 ","opcao2": "12 de agosto de 1765","opcao3": "3 de agosto de 1921","opcao4": "21 de março de 1819", "resposta": "1 de julho de 1889 "},

      { "pergunta": "Para além da sede, quantas delegações tem a União das Freguesias de Faro?", "opcao1": "1","opcao2": "4","opcao3": "3","opcao4": "2", "resposta": "3"},

      { "pergunta": "Qual é a rua mais comprida da cidade de Faro?", "opcao1": "Rua de São Luís ","opcao2": "Rua de Santo António","opcao3":"Rua Baptista Lopes","opcao4":"Rua Reitor Teixeira Guedes", "resposta": "Rua Reitor Teixeira Guedes"},

      { "pergunta": "Quem foi D. Francisco Gomes do Avelar?", "opcao1": "Bispo do Algarve ","opcao2":"Carpinteiro e entalhador","opcao3":"Estratega militar ","opcao4":"Pintor farense", "resposta": "Bispo do Algarve "},

      { "pergunta": "Quem foi Francisco Xavier Fabri?", "opcao1": "Governador da cidade ","opcao2":"Oficial da Marinha de Guerra Portuguesa","opcao3":"Pasteleiro","opcao4":"Arquiteto", "resposta": "Arquiteto"},

      { "pergunta": "O Teatro Municipal de Faro também é conhecido pelo nome de:", "opcao1": "Teatro Ria Formosa","opcao2":"Teatro Ossónoba","opcao3":"Teatro Lethes","opcao4":"Teatro das Figuras", "resposta": "Teatro das Figuras"},

      { "pergunta": "O Sporting Clube Farense é a filial do Sporting Clube de Portugal número:", "opcao1": "1","opcao2":"2","opcao3":"5","opcao4":"10", "resposta": "2"},

      { "pergunta": "Qual o rei que conquistou Faro aos Mouros?", "opcao1": "D. Afonso Henriques","opcao2":"D. Sancho I","opcao3":"D. Afonso III ","opcao4":"D. Dinis", "resposta": "D. Afonso III "},

      { "pergunta": "Em que ano a Rua de Santo António se tornou pedonal?", "opcao1": "1852","opcao2":"1921","opcao3":"1970","opcao4":"1995", "resposta": "1970"},

      { "pergunta": "Qual o nome do mestre calceteiro que executou a calçada portuguesa da Rua de Santo António?", "opcao1": "Mestre Perdigão ","opcao2":"Mestre Américo","opcao3":"Mestre Vargues ","opcao4":"Mestre Jardim", "resposta": "Mestre Américo"},

      { "pergunta": "Em que ano ocorreu a 1ª concentração Motard de Faro?", "opcao1": "1992","opcao2":"2003","opcao3":"1975","opcao4":"1981", "resposta": "1981"},

      { "pergunta": "Existe uma capela dos ossos em Faro que está na igreja:", "opcao1": "São Pedro","opcao2":"São Francisco","opcao3":"Carmo","opcao4":"São Sebastião", "resposta": "Carmo"},

      { "pergunta": "A Ria Formosa tem a sua largura máxima em frente a Faro que é aproximadamente de:", "opcao1": "5 km ","opcao2":"10 km","opcao3":"3 km","opcao4":"1 km", "resposta": "5 km "},

      { "pergunta": "Pavilhão Municipal da Penha Piscinas Municipais Quantas Escolas Secundárias existem na cidade de Faro?", "opcao1": "3","opcao2":"1","opcao3":"2","opcao4":"5", "resposta": "3"},

      { "pergunta": "Teatro Lethes Qual o nome do Jardim da Alameda?", "opcao1": " João de Deus","opcao2":"Infante D. Henrique","opcao3":"D. Dinis","opcao4":"Duarte Pacheco", "resposta": " João de Deus"}

    ]}

}, (error, res, body) => {
  if (error) {
    console.error(error)
    return
  }
  console.log(`statusCode: ${res.statusCode}`)
  console.log("Dados enviados com sucesso!")
})
