# 🚀 API Inteligente com Reconhecimento de Fala e IA Generativa

## 📌 Sobre o Projeto

Este projeto consiste no desenvolvimento de uma **API REST Inteligente** utilizando **Java 25**, **Spring Boot** e **Spring AI**, integrada com modelos de linguagem da OpenAI para fornecer recursos avançados de Inteligência Artificial.

A aplicação foi construída com foco em simular cenários modernos de mercado, envolvendo:

* Integração com LLMs (Large Language Models)
* Reconhecimento de fala (Speech-to-Text)
* Síntese de voz (Text-to-Speech)
* Contexto conversacional com IA
* Tool Calling
* Arquitetura REST
* Persistência de dados
* Infraestrutura com Docker

O projeto demonstra na prática como aplicações Java podem incorporar IA Generativa para criação de assistentes inteligentes e automação de fluxos de negócio.

---

# 🧠 Tecnologias Utilizadas

| Tecnologia         | Finalidade                    |
| ------------------ | ----------------------------- |
| Java 25            | Linguagem principal           |
| Spring Boot        | Construção da API REST        |
| Spring AI          | Integração com IA Generativa  |
| OpenAI GPT-4o Mini | Modelo de linguagem           |
| Gradle             | Gerenciamento de dependências |
| Docker             | Infraestrutura e containers   |
| IntelliJ IDEA      | Ambiente de desenvolvimento   |

---

# 🏛️ Arquitetura da Aplicação

A aplicação foi estruturada seguindo princípios de separação de responsabilidades e arquitetura em camadas:

```text id="e6v7u9"
Controller → Service → Integração IA/OpenAI → Persistência
```

### Principais componentes:

* **Controllers**

  * Responsáveis pela exposição dos endpoints REST.

* **Services**

  * Contêm a lógica de negócio e orquestração da IA.

* **Spring AI**

  * Gerencia comunicação com os modelos LLM.

* **Speech & Transcription**

  * Processamento de voz e conversão de áudio.

* **Infraestrutura**

  * Containers Docker e persistência de dados.

---

# 🎯 Funcionalidades Implementadas

## ✅ Integração com LLMs

Comunicação com o modelo **GPT-4o Mini** da OpenAI utilizando Spring AI.

## ✅ Chat Conversacional

Gerenciamento de contexto e fluidez nas interações com IA.

## ✅ Tool Calling

Execução de funções reais através de comandos gerados pela IA.

## ✅ Speech-to-Text

Conversão de áudio em texto utilizando APIs de transcrição.

## ✅ Text-to-Speech

Geração de voz sintética a partir de respostas textuais.

## ✅ API REST

Exposição de endpoints REST para integração externa.

## ✅ Persistência e Infraestrutura

Estruturação da aplicação com Docker e banco de dados.

---

# 📚 Conceitos Aplicados

Durante o desenvolvimento deste projeto, foram aplicados conceitos importantes como:

* Arquitetura REST
* Integração com APIs externas
* Engenharia de Prompt
* IA Generativa
* Processamento de áudio
* Containers Docker
* Arquitetura em camadas
* Boas práticas com Spring Boot
* Comunicação cliente-servidor
* Organização de serviços desacoplados

---

# ⚙️ Como Executar o Projeto

## Pré-requisitos

* Java 25
* Docker
* Gradle

---

## Clone o repositório

```bash id="9j7w2c"
git clone https://github.com/Brtkviktor/java-generative-ai-api
```

---

## Configure a variável de ambiente

```env id="z0v8jk"
OPENAI_API_KEY=sua-chave-api
```

---

## Execute a aplicação

```bash id="s3n0qe"
./gradlew bootRun
```

---

## Suba a infraestrutura Docker

```bash id="c7h3dw"
docker-compose up -d
```

---

# 🚀 Diferenciais Técnicos do Projeto

* Utilização de IA Generativa integrada ao ecossistema Java
* Implementação de reconhecimento e síntese de voz
* Uso prático do Spring AI
* Estrutura preparada para evolução escalável
* Separação clara de responsabilidades
* Aplicação moderna alinhada às tendências atuais de mercado

---
