-- ### SQL SCRIPT FOR ATM ### --
CREATE TABLE IF NOT EXISTS public.atm (
	id bigserial NOT NULL,
	registration_time timestamp NOT NULL,
	fifty_note int4 NOT NULL,
	five_note int4 NOT NULL,
	ten_note int4 NOT NULL,
	twenty_note int4 NOT NULL,
	CONSTRAINT atm_pkey PRIMARY KEY (id)
);


INSERT INTO public.atm
(registration_time, fifty_note, five_note, ten_note, twenty_note)
VALUES(NOW(), 10, 30, 30, 20);

CREATE TABLE IF NOT EXISTS public.user_atm (
	id bigserial NOT NULL,
	registration_time timestamp NOT NULL,
	max_withdrawal int4 NULL,
	pin int4 NOT NULL,
	CONSTRAINT user_atm_pkey PRIMARY KEY (id)
);

INSERT INTO public.user_atm
(id,registration_time, max_withdrawal, pin)
VALUES(10001,NOW(), 300, 800);

INSERT INTO public.user_atm
(id,registration_time, max_withdrawal, pin)
VALUES(10002,NOW(), NULL, 1230);



CREATE TABLE IF NOT EXISTS public.accounts (
	id bigserial NOT NULL,
	registration_time timestamp NOT NULL,
	account varchar(255) NOT NULL,
	balance int4 NULL,
	user_atm_id int8 NOT NULL,
	CONSTRAINT accounts_pkey PRIMARY KEY (id),
	CONSTRAINT uk_53lyyc8d8ig635u2bp1gbqst UNIQUE (account)
);



ALTER TABLE public.accounts ADD CONSTRAINT fk1fyapvu896ivm59jeojnqq29t FOREIGN KEY (user_atm_id) REFERENCES public.user_atm(id);


INSERT INTO public.accounts
(registration_time, account, balance, user_atm_id)
VALUES(NOW(), '123456789', 200, 10001);

INSERT INTO public.accounts
(registration_time, account, balance, user_atm_id)
VALUES(NOW(), '987654321', 150, 10002);

INSERT INTO public.accounts
(registration_time, account, balance, user_atm_id)
VALUES(NOW(), '639426339', 2000, 10001);


  -- ### volumes:### --
      -- ###- "./sql/initial.sql:/docker-entrypoint-initdb.d/1.sql"### --


