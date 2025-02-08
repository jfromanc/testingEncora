testing-automation

1) tener instalado y configurar en variables de entorno Java 11.0.23
2) abrir y configurar la herramienta IntelliJ o cualquier otra herramienta que se piense usar para ejecutar el proyecto con Java 11
3) tener la version de chromeDriver o edgeDriver alojados en el proyecto, para esto primero nos aseguramos que version tenemos en nuestro navegador loval y posteriormente nos dirigimos a los siguientes enlaces:
	chrome: https://googlechromelabs.github.io/chrome-for-testing/
	edge: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/?form=MA13LH
nota: actualizar la version del navegador (el la mayoría de casos ese se actualiza automáticamente al entrar a observar la version en settings > acerca del navegador)
4) ir a la terminal del proyecto y ejecutar los comandos:
	- ejecutar los siguientes comandos uno por uno en el terminal de proyecto o git bash:
		- mvn dependency:resolve
		- mvn verify
		- mvn clean install -U
	- en caso haber problemas con las dependencias, puedes intentar:
		- mvn dependency:purge-local-repository
		- mvn clean install
5) para este punto ya debería haberse ejecutado, en caso no sea asi, pruebe ejecutando la siguiente query desde el terminal del proyecto o git bash:
	- mvn test -Dcucumber.filter.tags="@ESCENARIO_PARABANK"