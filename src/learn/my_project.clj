(ns learn.my-project)

; ����˽�б��������ַ���
; �� def ��� ^{} ���޶�����
; ʹ�� def- ��
(def ^{:private true}
  source-name "supersource")

(defn- data-stream
  [source]
  (comment ...))

; ������ʹ�� ^{} �������趨Ϊ����
(def ^{:const true}
  default-score 100)

(defn test-hello
  [& args]
  (println "Hello, World!"))