# UTS_aplikasiTerdistribusi
UTS
Aplikasi ini merupakan aplikasi messaging antara Client dan Server
Aplikasi dibuat menggunakan bahasa pemograman java
requirement :
JRE : https://www.oracle.com/java/technologies/javase-jre8-downloads.html
JDK : https://www.oracle.com/java/technologies/javase-jdk16-downloads.html
IDE IntelliJ(optional)
cara menjalankan :
buka 2 cmd dan ganti directory ke IdeaProjects\Uts2way
pada cmd pertama debug dan run file Server.java
pada cmd kedua debug dan run file Client.java
n.b:
Aplikasi messaging dijalankan secara turn by turn, dimulai dari sisi client.
message dari client akan diteruskan ke server, server dapat membalas message tersebut.
Aplikasi akan berhenti ketika mengetik "end" pada file Server maupun Client.

cara menjalankan menggunakan IDE(IntelliJ) :
run dan debug file Server terlebih dahulu, diikuti dengan file Client. 
Aplikasi akan berhenti ketika mengetik "end" pada file Server maupun Client.

bug yang ada : 
- Dapat mengirimkan message kosong ketika menekan "Enter" pada keyboard.
- Message hanya dapat dikirimkan 1 per 1, tidak bisa lebih. 
Jika mengirimkan lebih dari 1 message sekaligus, message ke 2 akan stuck, dan akan terkirim pada giliran berikutnya secara otomatis.
