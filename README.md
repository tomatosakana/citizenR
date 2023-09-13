# citizenRとは

citizenRは市民活動団体の情報を一覧で表示し、新規登録・更新・削除ができるアプリケーションです。

# デモ画面
* 団体情報の登録(フォームに情報を入力し送信ボタンを押すと表の最下部に追加され、「登録完了」と表示される。）
<img src="https://github.com/tomatosakana/citizenR/assets/144295158/513850eb-f4bf-4620-8c61-c953d65c4b8f" width="90%"><img src="https://github.com/tomatosakana/citizenR/assets/144295158/6c621c3e-3438-4ad3-8eae-e9e60afd4769" width="90%">

* 団体情報の削除(表の削除ボタンを押すと情報が削除され、「削除完了と表示される」
  <img src="https://github.com/tomatosakana/citizenR/assets/144295158/866295fc-62f4-436a-b072-2c45f3a30319" width="90%">


* 団体情報の更新（編集ボタンを編集画面に遷移し、フォームにて情報を更新し送信を押すと情報が更新される。）
  <img src="https://github.com/tomatosakana/citizenR/assets/144295158/7d236598-1ab5-4989-a73f-f3007bd44284" width="90%">

# 作成の経緯

* 前職で行っていた団体情報管理業務の補助を想定して作成しました。
* 現在学習しているjava,sql,springの理解をより深めるため、サービスを自作しました。

# 起動方法

CitizenApplication.java内のmainメソッドを起動し、http://localhost:8080/citizen にアクセスします。

# 使用技術

* 言語　java17
* データベース　H2 database
* フレームワーク　spring framework
