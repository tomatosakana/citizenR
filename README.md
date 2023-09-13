# ポートフォリオ（citizenR）について

現在学習中のjava, sql, spring frameworkなどの理解をより深めるために制作しました。

mvcモデルで作成し、データベースの基本的なcrud操作を行います。

前職での業務の補助を想定して、市民活動団体情報の一覧表示・新規登録・更新・削除ができるアプリケーションを作成しました。

# デモ画面
* 団体情報の表示と登録
  
  ・事前に用意したデータベースを読み込み、取得した情報を一覧にして表示しています。
  
  ・フォーム入力後送信ボタンを押すと、内部で情報を受けとりデータベースに追加します。
<img src="https://github.com/tomatosakana/citizenR/assets/144295158/513850eb-f4bf-4620-8c61-c953d65c4b8f" width="100%"><img src="https://github.com/tomatosakana/citizenR/assets/144295158/6c621c3e-3438-4ad3-8eae-e9e60afd4769" width="100%">

* 団体情報の削除

  ・削除ボタンを押すと、個別のidをもとに該当する情報をデータベースから削除します。
  <img src="https://github.com/tomatosakana/citizenR/assets/144295158/866295fc-62f4-436a-b072-2c45f3a30319" width="100%">


* 団体情報の更新
  
  ・編集ボタンを押すと、個別のidをもとに編集対象の持つ情報を表示します。
  
  ・編集後送信ボタンを押すと、該当するデータの情報を更新します。
  <img src="https://github.com/tomatosakana/citizenR/assets/144295158/7d236598-1ab5-4989-a73f-f3007bd44284" width="100%">


# 起動方法

CitizenApplication.java内のmainメソッドを起動し、http://localhost:8080/citizen にアクセスします。

# 使用技術

* 言語　java17
* データベース　H2 database
* フレームワーク　spring framework
