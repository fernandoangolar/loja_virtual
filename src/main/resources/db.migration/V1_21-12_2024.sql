select constraint_name from information_schema.constraint_column_usage
where table_name = 'usuario_acesso' and column_name = 'acesso_id'
and constraint_name <> 'unique_acesso_user';

alter table usuarios_acessos drop CONSTRAINT "ukqs91qokws6i46m1vnsoakivh1";