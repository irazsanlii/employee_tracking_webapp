CREATE TABLE public.employee
(
    employee_id bigint NOT NULL,
    created_at timestamp without time zone NOT NULL,
    department character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying(64) COLLATE pg_catalog."default" NOT NULL,
    employee_role bpchar COLLATE pg_catalog."default" NOT NULL,
    employee_status bpchar COLLATE pg_catalog."default" NOT NULL,
    fullname character varying(64) COLLATE pg_catalog."default" NOT NULL,
    password character varying(64) COLLATE pg_catalog."default" NOT NULL,
    phone character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT employee_pkey PRIMARY KEY (employee_id),
    CONSTRAINT uk4cqya34g5li0rpa40lum60l2 UNIQUE (employee_id, email, phone)
);

CREATE TABLE public.project
(
    project_id bigint NOT NULL,
    client character varying(255) COLLATE pg_catalog."default",
    end_date date NOT NULL,
    project_name character varying(64) COLLATE pg_catalog."default" NOT NULL,
    start_date date NOT NULL,
    CONSTRAINT project_pkey PRIMARY KEY (project_id)
);

CREATE TABLE public.team
(
    team_id bigint NOT NULL,
    team_name character varying(64) COLLATE pg_catalog."default" NOT NULL,
    project_id bigint,
    CONSTRAINT team_pkey PRIMARY KEY (team_id),
    CONSTRAINT fkp6ovpc4soflfcjbafch33w2ky FOREIGN KEY (project_id)
        REFERENCES public.project (project_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE public.card
(
    card_id bigint NOT NULL,
    created_at timestamp without time zone NOT NULL,
    CONSTRAINT card_pkey PRIMARY KEY (card_id)
);