DROP TABLE jumun_detail CASCADE CONSTRAINTS;
DROP TABLE jumun CASCADE CONSTRAINTS;
DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE userinfo CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: userinfo */
/**********************************/
CREATE TABLE userinfo(
		userId                        		VARCHAR2(100)		 NULL ,
		password                      		VARCHAR2(100)		 NULL ,
		name                          		VARCHAR2(100)		 NULL ,
		email                         		VARCHAR2(100)		 NULL 
);

COMMENT ON TABLE userinfo is 'userinfo';
COMMENT ON COLUMN userinfo.userId is 'userId';
COMMENT ON COLUMN userinfo.password is 'password';
COMMENT ON COLUMN userinfo.name is 'name';
COMMENT ON COLUMN userinfo.email is 'email';


/**********************************/
/* Table Name: product */
/**********************************/
CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(50)		 NOT NULL,
		p_price                       		NUMBER(10)		 DEFAULT 0		 NOT NULL,
		p_image                       		VARCHAR2(100)		 DEFAULT 'images/no_image.jpg'		 NOT NULL,
		p_desc                        		VARCHAR2(200)		 NULL ,
		p_click_count                 		NUMBER(10)		 DEFAULT 0		 NOT NULL
);

DROP SEQUENCE product_p_no_SEQ;

CREATE SEQUENCE product_p_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE product is 'product';
COMMENT ON COLUMN product.p_no is 'p_no';
COMMENT ON COLUMN product.p_name is 'p_name';
COMMENT ON COLUMN product.p_price is 'p_price';
COMMENT ON COLUMN product.p_image is 'p_image';
COMMENT ON COLUMN product.p_desc is 'p_desc';
COMMENT ON COLUMN product.p_click_count is 'p_click_count';


/**********************************/
/* Table Name: cart */
/**********************************/
CREATE TABLE cart(
		cart_no                       		NUMBER(10)		 NULL ,
		cart_qty                      		NUMBER(10)		 DEFAULT 1		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		userId                        		VARCHAR2(100)		 NULL 
);

DROP SEQUENCE cart_cart_no_SEQ;

CREATE SEQUENCE cart_cart_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE cart is 'cart';
COMMENT ON COLUMN cart.cart_no is 'cart_no';
COMMENT ON COLUMN cart.cart_qty is 'cart_qty';
COMMENT ON COLUMN cart.p_no is 'p_no';
COMMENT ON COLUMN cart.userId is 'userId';


/**********************************/
/* Table Name: jumun */
/**********************************/
CREATE TABLE jumun(
		j_no                          		NUMBER(10)		 NULL ,
		j_desc                        		VARCHAR2(100)		 NULL ,
		j_date                        		DATE		 NULL ,
		j_price                       		NUMBER(10)		 NULL ,
		userId                        		VARCHAR2(100)		 NULL 
);

DROP SEQUENCE jumun_j_no_SEQ;

CREATE SEQUENCE jumun_j_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE jumun is 'jumun';
COMMENT ON COLUMN jumun.j_no is 'j_no';
COMMENT ON COLUMN jumun.j_desc is 'j_desc';
COMMENT ON COLUMN jumun.j_date is 'j_date';
COMMENT ON COLUMN jumun.j_price is 'j_price';
COMMENT ON COLUMN jumun.userId is 'userId';


/**********************************/
/* Table Name: jumun_detail */
/**********************************/
CREATE TABLE jumun_detail(
		jd_no                         		NUMBER(10)		 NULL ,
		jd_qty                        		NUMBER(10)		 NULL ,
		j_no                          		NUMBER(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

DROP SEQUENCE jumun_detail_jd_no_SEQ;

CREATE SEQUENCE jumun_detail_jd_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE jumun_detail is 'jumun_detail';
COMMENT ON COLUMN jumun_detail.jd_no is 'jd_no';
COMMENT ON COLUMN jumun_detail.jd_qty is 'jd_qty';
COMMENT ON COLUMN jumun_detail.j_no is 'j_no';
COMMENT ON COLUMN jumun_detail.p_no is 'p_no';



ALTER TABLE userinfo ADD CONSTRAINT IDX_userinfo_PK PRIMARY KEY (userId);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (cart_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (p_no) REFERENCES product (p_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (userId) REFERENCES userinfo (userId);

ALTER TABLE jumun ADD CONSTRAINT IDX_jumun_PK PRIMARY KEY (j_no);
ALTER TABLE jumun ADD CONSTRAINT IDX_jumun_FK0 FOREIGN KEY (userId) REFERENCES userinfo (userId);

ALTER TABLE jumun_detail ADD CONSTRAINT IDX_jumun_detail_PK PRIMARY KEY (jd_no);
ALTER TABLE jumun_detail ADD CONSTRAINT IDX_jumun_detail_FK0 FOREIGN KEY (j_no) REFERENCES jumun (j_no);
ALTER TABLE jumun_detail ADD CONSTRAINT IDX_jumun_detail_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);

