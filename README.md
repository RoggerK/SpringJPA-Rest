# SpringJPA-Rest
Estructura en Spring referente a rest y usando JPA para las consultas

Se uso:

  Eclipse Enterprise
  
  Java JDK: 1.8
  
  POSTMAN
  
  MySQLWorkbench

Dependecias que se usaron:

    Lombok: Nos ayuda a genererar tanto get y set de las clases,
            en caso no te reconozca debes instalar lombok en tu
            eclipse.

    MysqlConnector: La conexion de la base de datos.
    
    JPAData: Nos ayuda hacer las consultas de una forma más facil y ordenada.

	<dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<optional>true</optional>
	</dependency>

	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
	</dependency>

	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-jpa</artifactId>
	</dependency>
