-- サンプル
INSERT INTO lf_sample(
title
,content
)
VALUES(
'Sample'
,'これはサンプルのデータです。'
);

-- ユーザ
INSERT INTO lf_user(
user_id
,login_password
,nickname
)
VALUES(
'testUser'
,'testPass1234'
,'テストユーザ'
);

-- 記事
INSERT INTO lf_article(
user_id
,title
,content
)
VALUES(
'testUser'
,'テスト記事のタイトル'
,'これはテスト記事の内容です。アプリから登録できるようにしてください。'
);

-- 返答
INSERT INTO lf_reply(
article_id
,user_id
,comment
)
VALUES(
1 -- lf_articleの値を設定（1は仮置き）
,'testUser'
,'テスト記事に対するコメントです。'
);
