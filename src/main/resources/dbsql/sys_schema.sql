-- 创建数据库
-- CREATE DATABASE seckill DEFAULT CHARACTER SET utf8;

DROP TABLE IF EXISTS `secshopping`;
DROP TABLE IF EXISTS `secshopping_order`;

-- 创建秒杀商品表
create table sec_shopping
(
    `secshopping_id` bigint    not null auto_increment comment '商品id',
    `title`          varchar(1000)      default null comment '商品标题',
    `image`          varchar(1000)      default null comment '商品图片',
    `price`          decimal(10, 2)     default null comment '商品原价格',
    `cost_price`     decimal(10, 2)     default null comment '商品秒杀价格',
    `stock_count`    bigint             default null comment '剩余库存数量',
    `start_time`     timestamp not null default '1970-02-01 00:00:01' comment '秒杀开始时间',
    `end_time`       timestamp not null default '2000-01-01 00:00:01' comment '秒杀结束时间',
    `create_time`    timestamp not null default current_timestamp comment '创建时间',
    Primary Key (`secshopping_id`),
    key `idx_start_time` (`start_time`),
    key `idx_end_time` (`end_time`),
    key `idx_create_time` (`create_time`)
) charset = utf8
  engine = innodb comment '秒杀商品表';

-- 创建秒杀订单表
create table sec_shopping_order
(
    `secshopping_id` bigint    not null comment '秒杀商品ID',
    `money`          decimal(10, 2)     DEFAULT NULL comment '支付金额',
    `user_phone`     bigint    NOT NULL comment '用户手机号',
    `create_time`    timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '创建时间',
    `state`          tinyint   NOT NULL DEFAULT -1 comment '状态：-1无效 0成功 1已付款',
    PRIMARY KEY (`secshopping_id`, `user_phone`) /*联合主键，保证一个用户只能秒杀一件商品*/
) CHARSET = utf8
  ENGINE = innodb comment '秒杀订单表';