# Readme

O objetivo desta atividade é automatizar uma tarefa de build de uma aplicação Java(Maven) com o Jenkins.

Adicione as dependências necessárias para executar a atividade.



### Passos adicionais:

Após tentativas, e erros de build foi possível realizar a atividade definindo dois passos:



1. Configurar a variável **MAVEN_HOME** no <u>path de sistema</u>, pois estava apenas no <u>path de usuário.</u>
2. Na categoria **Build Triggers**, habilitar a opção **Poll SCM**



### Ilustração do êxito abaixo:



![img](https://i.imgur.com/Xhgba2y.png)