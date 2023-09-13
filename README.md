# ポートフォリオ（citizenR）について

現在学習中のjava, sql, spring frameworkなどの理解をより深めるために制作しました。

mvcモデルで作成し、データベースの基本的なcrud操作を行います。

前職での業務の補助を想定して、市民活動団体情報の一覧表示・新規登録・更新・削除ができるアプリケーションを作成しました。

# デモ画面
* 団体情報の表示と登録
  
  ・事前に用意したデータベースを読み込み、取得した情報を一覧にして表示しています。
  
  ・フォーム入力後送信ボタンを押すと、内部で情報を受けとりデータベースに追加します。
  <img src="https://github.com/tomatosakana/citizenR/assets/144295158/d5ac26c1-5ad8-443f-b0f0-5865859c1d93"  width="70%">
  <img src="https://github.com/tomatosakana/citizenR/assets/144295158/27d2e66a-bd7d-4303-a954-73f0bfb24954"  width="70%">

* 団体情報の削除

  ・削除ボタンを押すと、個別のidをもとに該当する情報をデータベースから削除します。
    <img src="https://github.com/tomatosakana/citizenR/assets/144295158/17ba7d2e-9421-436e-aeb5-38ce24a377e3"  width="70%">

* 団体情報の更新
  
  ・編集ボタンを押すと、個別のidをもとに編集対象の持つ情報を表示します。
  
  ・編集後送信ボタンを押すと、該当するデータの情報を更新します。
 <img src="https://github.com/tomatosakana/citizenR/assets/144295158/e203b9c4-1ad1-47c7-b575-bb2fe09c170c"  width="70%">

# 起動方法

CitizenApplication.java内のmainメソッドを起動し、http://localhost:8080/citizen にアクセスします。

# 使用技術

* 言語　java17
* データベース　H2 database
* フレームワーク　spring framework
