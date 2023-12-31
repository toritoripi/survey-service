# survey-service
Webアプリケーションの**作成練習**

# 概要
- ペットの満足度を調査する（名前/年齢/性別/満足度/飼い主への意見）

# 構成要件
- Java 19
- SpringBoot 3.1.2
- H2 Database
- JUnit（予定（願望））

# 機能一覧
| 機能| 詳細 | URL |
|:-------------|:------------|:-------------|
| 全件取得|  回答一覧の表示 | /surveys     |
| 詳細取得| 特定の回答表示 | /surveys/{id}|
| 新規登録 　　 | アンケートに回答する | /survey/answerForm |
| ログイン機能| ユーザー名とパスワードでログイン| 未実装 |
| 編集機能　    | 内容を編集する |  未実装  |

# DBテーブル
テーブル名：
| カラム名| データ型 | NotNull | キー | 備考|
|:-------------|:------------|:-------------|:-------------|:-------------|
| ID| int| NOTNULL | 主キー |ID（自動生成） |  
| NAME| VARCHAR(256) | NOTNULL | |名前 | 
| AGE | int | NOTNULL |  | 年齢 |
| SEX | int | NOTNULL | |1:オス/2:メス/3:不明 | 
| SCORE | int | NOTNULL ||1:とても不満/2:不満/3:普通/4:満足/5:とても満足|
| MESSAGE |VARCHAR(256)| NOTNULL | |飼い主への意見|

# 実行結果

# やりたいけどまだできてないこと
- ユーザー名とパスワードを用いたログイン機能（未実装）
- 満足度の比率表示（未実装）
- JUnitを使ってテストつくる（未実装）
