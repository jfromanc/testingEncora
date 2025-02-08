#language: es
@FEATURE_DEMOBLAZE

Característica: Validar el funcionamiento de los formularios de ParaBank
  Como automatizador web
  Quiero validar el funcionamiento de los formularios
  Para registrar usuarios

  @ESCENARIO_PARABANK
  Esquema del escenario: Registro exitoso de un nuevo usuario
    Dado que el usuario abre la pagina en el navegador "<navegador>"
    Cuando hace clic en el enlace de Register
    E ingresa "<firstName>" en el campo First Name
    E ingresa "<lastName>" en el campo Last Name
    E ingresa "<address>" en el campo Address
    E ingresa "<city>" en el campo City
    E ingresa "<state>" en el campo State
    E ingresa "<zipCode>" en el campo Zip Code
    E ingresa "<phone>" en el campo Phone
    E ingresa "<ssn>" en el campo SSN
    E ingresa "<username>" en el campo Username
    E ingresa "<password>" en el campo Password
    E ingresa "<password>" en el campo Confirm Password
    Y hace clic en el boton Register
    Entonces visualiza el mensaje "Your account was created successfully. You are now logged in."
    Y accede a la pagina de inicio de sesion para autenticarse con "<username>" y "<password>"
    Ejemplos:
      | navegador | firstName | lastName | address   | city   | state  | zipCode | phone    | ssn         | username          | password    |
      | chrome    | Juan      | Flores   | Calle 123 | Madrid | Madrid | 28001   | 555-0101 | 123-45-6789 | testing19Encora97 | testing1997 |
      | edge      | Josue     | Flores   | Calle 123 | Madrid | Madrid | 28001   | 555-0101 | 123-45-6789 | testing20Encora01 | testing1997 |