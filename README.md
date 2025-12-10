# OOXX – Android App (Java)
📅 **原始製作日期：2021 / 04 / 15**  

這是一個使用 **Java** 與 **Android XML Layout** 製作的簡單井字遊戲（OOXX）。  
玩家輪流在 3x3 按鈕格子中落子，系統會自動判斷 O 或 X 是否勝利，並可重新開始遊戲。

本專案不需要編譯，也不需要 Android Studio。  
主要作為作品集展示 Java 程式碼與 Android UI Layout 設計。

---

## 📌 專案內容


| 檔案 | 說明 |
|------|------|
| `MainActivity.java` | 控制 OOXX 遊戲邏輯（回合判定、勝利判斷、重置功能） |
| `activity_main.xml` | 使用 ConstraintLayout + TableLayout 排版的 UI 介面 |
| `README.md` | 專案說明文件（本文件） |

---

## 🧩 功能說明

- 3x3 格按鈕（OOXX 主遊戲區）
- 自動判斷輪到 O 或 X
- 勝利條件檢查：
  - 三橫排（123, 456, 789）
  - 三直排（147, 258, 369）
  - 兩斜線（159, 357）
- 顯示「O贏了」或「X贏了」
- 提供「重新開始」清除棋盤

---

## 🖥 使用技術

- **Java**
- **Android Activity**
- **OnClickListener**
- **ConstraintLayout**
- **TableLayout / TableRow**
- **ArrayList**
- **字串包含判斷勝利邏輯**

---


