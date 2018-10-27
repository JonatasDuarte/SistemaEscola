//Cadastrar o Data Source(gerenciador da conexão com o BD);

/subsystem=datasources/data-source=PostgreSQLPoolEscolaJonatas:add(driver-name="postgres", jndi-name="java:/jonatasDS", connection-url="jdbc:postgresql://localhost:5432/SistemaEscola", user-name="postgres", password="postgres");

//Cadastrar o JDBC Realm;

/subsystem=security/security-domain=escolaJonatasJdbcRealm/:add(cache-type=default);

//Configura a forma de login do professor;

/subsystem=security/security-domain=escolaJonatasJdbcRealm/authentication=classic:add(login-modules=[{code=Database, flag=Required, module-options={ 
dsJndiName="java:/jonatasDS", 
principalsQuery="select senha from professor where login = ?", 
rolesQuery="select 'PROFESSOR', 'Roles' from professor where login = ?", 
hashAlgorithm="SHA-256", 
hashEncoding="base64" 
}}])
