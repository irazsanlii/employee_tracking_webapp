INSERT INTO public.employee (employee_id,created_at,department,email, employee_role,employee_status,fullname,password,phone)
VALUES ('1','12-07-2020 08:29:06','Yazılım Geliştirme','iraz@email.com','ROLE_ADMIN','ACTIVE','Iraz Şanlı','deneme','5302475715');
INSERT INTO public.employee (employee_id,created_at,department,email, employee_role,employee_status,fullname,password,phone)
VALUES ('2','12-07-2020 08:30:56','Yazılım Geliştirme','basak@email.com','ROLE_USER','ACTIVE','Başak Şanlı','12345','5419111941');

INSERT INTO public.project (project_id,client,end_date,project_name,start_date)
VALUES ('1','JFORCE','27-07-2020','Çalışan Takip Programı','29-06-2020');
INSERT INTO public.project (project_id,client,end_date,project_name,start_date)
VALUES ('2','ProconsultTech','29-07-2020','bonuscargo','29-06-2020');
INSERT INTO public.project (project_id,client,end_date,project_name,start_date)
VALUES ('3','Work Hunter','27-07-2020','İstihdam Platformu','29-06-2020');

INSERT INTO public.team (team_id,team_name)
VALUES ('1','Yazılım Geliştirme');
INSERT INTO public.team (team_id,team_name)
VALUES ('2','Yazılım Test');
INSERT INTO public.team (team_id,team_name)
VALUES ('3','Analiz');
INSERT INTO public.team (team_id,team_name)
VALUES ('4','Tasarım');
INSERT INTO public.team (team_id,team_name)
VALUES ('5','Satış');
INSERT INTO public.team (team_id,team_name)
VALUES ('6','Veri Analizi');
INSERT INTO public.team (team_id,team_name)
VALUES ('7','Organizasyon');

INSERT INTO public.card (card_id,created_at)
VALUES ('1','12-07-2020 08:29:06');
INSERT INTO public.card (card_id,created_at)
VALUES ('2','12-07-2020 08:29:06');
INSERT INTO public.card (card_id,created_at)
VALUES ('3','12-07-2020 08:29:06');
INSERT INTO public.card (card_id,created_at)
VALUES ('4','12-07-2020 08:29:06');

/*
insert into public.employee_role ('role_id','role_type')
VALUES ('1','ROLE_ADMIN');
insert into public.employee_role ('role_id','role_type')
VALUES ('2','ROLE_USER');

insert into public.employee_roles ('employee_id','role_id')
VALUES ('1','1');
insert into public.employee_roles ('employee_id','role_id')
VALUES ('2','2');
*/



