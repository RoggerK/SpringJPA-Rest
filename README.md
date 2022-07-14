# SpringJPA-Rest
Estructura en Spring referente a rest y usando JPA para las consultas

Se uso:
  Eclipse
  Java JDK: 1.8
  MySQLWorkbench

Dependecias que se usaron:
    Lombok: Nos ayuda a genererar tanto get y set de las clases,
            en caso no te reconozca debes instalar lombok en tu
            eclipse.
    <dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
    
    MysqlConnector: La conexion de la base de datos.
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
		</dependency>
    
    JPAData: Nos ayuda hacer las consultas de una forma más facil y ordenada.
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
