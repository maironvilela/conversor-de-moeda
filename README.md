
<img loading="lazy" src="https://images.pexels.com/photos/730547/pexels-photo-730547.jpeg?auto=compress&cs=tinysrgb" height="400" width="100%"/>
<h1 align="center">
     Projeto Conversor de Moeda
</h1>

  <p align="center">
    <a href="#sobre-o-projeto">Sobre o Projeto</a> |
    <a href="#principais-tecnologias">Principais Tecnologias</a> |
    <a href="#principais-recursos">Principais Recursos</a> |
    <a href="#estrutura_do_projeto">Estrutura do Projeto</a> |
    <a href="#executando_o_projeto">Executando o projeto</a>   
</p>

 
# 📒Sobre o Projeto

Um projeto simples de conversão de moedas que permite aos usuários converter valores entre diferentes moedas de forma 
rápida e fácil.


# 💻Principais Tecnologias

[![https://www.java.com/en/download/](https://img.shields.io/badge/@code-Java_V.23-052051)]() 

[![https://mvnrepository.com/artifact/io.github.cdimascio/java-dotenv](https://img.shields.io/badge/@LIBRARY-java_doteenv_(V.5.2.2)-3b82f6)]()
[![https://mvnrepository.com/artifact/com.google.code.gson/gson](https://img.shields.io/badge/@LIBRARY-gson_(V2.10.1)-3b82f6)]()

[![https://www.exchangerate-api.com/docs/pair-conversion-requests](https://img.shields.io/badge/@API-exchangerate_api-16a34a)]()
  

# ⚒️Principais Recursos

[![](https://img.shields.io/badge/Consumo_API_plataforma_Exchange_Rate_API-052051)]()
[![](https://img.shields.io/badge/Serialização_de_formato_json-052051)]()
[![](https://img.shields.io/badge/Obtenção_taxa_de_conversão_dinâmica-052051)]()

 

# 📂Estrutura do Projeto

```
  |-src
  |  |-br.com.current_converter
  |     |-CurrencyConverter: Responsável por realizar o calculo do valor convertido
  |     |-HttpResponseType: Definição das informações recebidas da API.
  |     |-JsonToObjectConverter: Converte json para um objeto
  |     |-LoadFile: Realiza a leitura de arquivos.
  |     |-Options Classe que define as informações das opções de moedas para conversão
  |-.env.example: Armazena as variaveis de ambiente. Após a clone do projeto, é necessário alterar seu 
  |               nome para ".env" e preencher as informações necessárioas para rodar o projeto 
  |-supported-currencies.json: Arquivo que armazena os tipos de moedas utilizados para conversão   
```

# 🚀Executando o projeto

**Passo 01:** Faça o clone do repositório

```
git clone https://github.com/maironvilela/conversor-de-moeda.git
```

**Passo 02:** Acesse o diretório do projeto, e altere o nome do arquivo `.env_example` para `.env`

**Passo 03:** Informe a KEY da API Exchange-rate-api na chave `EXCHANGE_RATE_API_KEY`

```
 EXCHANGE_RATE_API_KEY = 1235sada6er
```

**Passo 04:** Execute o projeto utilizando "SHIFT+F10"

 
📽️ Projeto em execução


[Assista ao vídeo clicando aqui](https://github.com/user-attachments/assets/37aae334-80e2-4a90-b92b-eeab7b16ed9f)