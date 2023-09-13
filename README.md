# ポートフォリオ（citizenR）について

現在学習中のjava, sql, spring frameworkなどの理解をより深めるために制作しました。

mvcモデルで作成し、データベースの基本的なcrud操作を行います。

前職での業務の補助を想定して、市民活動団体情報の一覧表示・新規登録・更新・削除ができるアプリケーションを作成しました。

# デモ画面
* 団体情報の表示と登録
  
  ・事前に用意したデータベースを読み込み、取得した情報を一覧にして表示しています。
  
  ・フォーム入力後送信ボタンを押すと、内部で情報を受けとりデータベースに追加します。
![スクリーンショット (2)](https://github.com/tomatosakana/citizenR/assets/144295158/5e250cf9-f2e2-4440-b13e-8a6deef8440b)
![スクリーンショット (3)](https://github.com/tomatosakana/citizenR/assets/144295158/8b10765f-f436-4776-a872-6cc0e639db17)


* 団体情報の削除

  ・削除ボタンを押すと、個別のidをもとに該当する情報をデータベースから削除します。
![スクリーンショット (4)](https://github.com/tomatosakana/citizenR/assets/144295158/11cbdb91-dd1b-4040-8c28-763f2ac6b2fb)


* 団体情報の更新
  
  ・編集ボタンを押すと、個別のidをもとに編集対象の持つ情報を表示します。
  
  ・編集後送信ボタンを押すと、該当するデータの情報を更新します。
![スクリーンショット (6)](https://github.com/tomatosakana/citizenR/assets/144295158/5a8d2080-f705-4dd4-a050-3a2ee938cb22)


# 起動方法

CitizenApplication.java内のmainメソッドを起動し、http://localhost:8080/citizen にアクセスします。

# 使用技術

* 言語　java17
* データベース　H2 database
* フレームワーク　spring framework
