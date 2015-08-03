; �ο���
; (ԭ��û��, ֻʣ������) http://webcache.googleusercontent.com/search?q=cache:woI2RKojiEUJ:huangznote.readthedocs.org/zh_CN/latest/language/clojure/composite_type.html+&cd=5&hl=zh-CN&ct=clnk&gl=cn
; http://developer.51cto.com/art/201307/401465.htm
; http://clojure-api-cn.readthedocs.org/en/latest/
; http://clojure.github.io/clojure/

; ʹ�� str ���������ַ���
;(println (str "Hello" " " "World" "!"))

; ���������
;(print (+ 1 1) (- 2 1) (* 1 2) (/ 2 1))

; �Ƚ�
;(println (= 1 1) (= 2 1))

; ȡ�������
;(println (not true))

; ʹ�� class ���ж���������, nil ���� null
;(println
;  (str
;    (class 1) "\n"
;    (class 1.) "\n"
;    (class "") "\n"
;    (class false) "\n"
;    (class nil)
;    ))

; ʹ�� quote ���� ' ����ӡһ�����ʽ(��ִ��, ֱ�Ӵ�ӡ������)
;(println
;  (quote (+ 1 2))
;  '(class 1)
;  (not true))

; ʹ�� eval ������������ʾ�ı��ʽ
;(println
;  (eval '(+ 1 2))
;  (eval (quote (+ 1 2))))

; ����(�б�)
;(println
;  ''(1 2 3)       ":" (class '(1 2 3)) "\n"
;  '(list 1 2 3)  ":" (class (list 1 2 3)) "\n")

; ����һ���б����и��ֲ���, ���Կ���ÿ�������Ľ����������һ���µ��б�, ������ı�ԭ�б�
; peek ȡ��ͷԪ��
; pop ȡ����ͷԪ��֮�������Ԫ��
; conj ��һ����Ԫ����ӵ��б�ͷ��
;(def list_01 (list "a" 'b "c"))
;(println list_01
;  (peek list_01)
;  (pop list_01)
;  (conj list_01 'alpha)
;  list_01)

; ���� ��������
;(println
;  '[1 2 3]          ":" (class [1 2 3]) "\n"
;  ''[1 2 3]         ":" (class '[1 2 3]) "\n"
;  '(vector 1 2 3)  ":" (class (vector 1 2 3)))

; ����һ�����������и��ֲ���
; get ��ȡָ���±������, ���������򷵻� nil
; nth ��ȡָ���±������, ����������ΪĬ��ֵ, δָ��ʱ����ѯ�����ڵ�Ԫ��, ��ᱨ��, ָ��֮��᷵��ָ����ֵ
; ����ֱ��ʹ��������Ϊ��������ȡָ����Ԫ��, ����Ԫ�ز�����ʱ�ᱨ��
; assoc �޸�ָ���±������, ��ָ�����±�Ϊ������ĩβ, ����Ӹ�����
;(def vector_01 (vector 'a 'b 'b 'd))
;(println vector_01
;  (get vector_01 0)
;  (get vector_01 100)
;  (nth vector_01 100 nil)
;  (vector_01 3)
;  (assoc vector_01 4 100)
;  (assoc vector_01 2 'c)
;  vector_01)

; ӳ��
; ��ϣӳ��
; �ѹ�ϣ��Ϊ����ֱ�ӵ��ÿ���ȡ�ö�Ӧ��ֵ, ֵ������ʱ���� nil
; get ȡ�ö�Ӧ��ֵ, ֵ������ʱ���� nil
; assoc ��� key-value, ���Ḳ���ظ���
; dissoc ɾ�� key-value, ������Բ����ڵ�
;(def hash_01 (hash-map :k1 "value1" :k2 100))
;(println hash_01
;  (hash_01 :k1)
;  (hash_01 :no-exists-key)
;  (get hash_01 :k2)
;  (get hash_01 :no-exists-key) "\n"
;  (assoc hash_01 :newKey '(1 2 3) :anotherKey [1 2 3] :k1 "test" :k1 "ttt")
;  (dissoc hash_01 :k1 :no-exists-key))

; ����ӳ��
; ��֪��Ϊɶ���ֺ��ַ�����ͬʱ������
; sorted-map-by ����ָ���Ƚ����õķ���, �õȺŵ�ʱ����ҵ�һ����Ϳ
;(def sorted_01 (sorted-map :ac 1 :b 3 :1 4))
;(def sorted_02 (sorted-map 1 :b 10 :1 5 'd))
;(def sorted_03 (sorted-map-by > 1 :a 2 :b 3 :c))
;(def sorted_04 (sorted-map-by = 1 :a 2 :b 3 :c 2 :e))
;(println
;  sorted_01 "\n"
;  sorted_02 "\n"
;  sorted_03 "\n"
;  sorted_04 "\n"
;  (get sorted_03 2) "\n")

; merge �ϲ�ӳ��, ���ӳ��� key ���Ͳ�ͳһ, �ᱬը
; zipmap ����ӳ��, ���ɳ���������ͨ��ϣӳ��, ��˳��Ϊ����ĵ���, Ƿȱ��ֵ�������
;(println
;  (merge sorted_03 sorted_04) "\n"
;  (zipmap '(:a :b :e :d :c) '(1 3 5 2)) "\n"
;  (contains? sorted_01 :ac) "\n"
;  (class sorted_01) "\n"
;  (class sorted_04) "\n"
;  (class {:a 1 :b 2 :c 3}))

; ����
;(def set_01 #{ :a :b :c :d })
;(def set_02 (hash-set :e :f :d))

; conj �򼯺����������
; disj ɾ�������е�ĳ������
; get �����д��ڸ�ֵʱ, ���ظ�ֵ, ���򷵻� nil
; ֱ�ӽ�������Ϊ��������ͬ��
;(println
;  set_01
;  set_02 "\n"
;  (conj set_01 :z :x :a)
;  (conj set_02 [:p :q]) "\n"
;  (disj set_01 :b)
;  (disj set_02 :g) "\n"
;  (get set_01 :c)
;  (get set_02 :no-exists-key) "\n"
;  (set_01 :a)
;  (set_02 :no-exists-key))

; ��Ҫ�������
; union ���ؼ��ϵĲ���
; intersection ���ؼ��ϵĽ���
; difference �����ڶ���������û�г��ֹ��ĵ�һ�����ϵ�Ԫ��
;(use 'clojure.set)
;(println
;  (union set_01 set_02) "\n"
;  (intersection set_01 set_02) "\n"
;  (difference set_01 set_02))

; ���򼯺�
;(def set_03 (sorted-set :i :h :j))
;(println set_03)

;(def listTest '(1 2 3))
;(def vectorTest [1 2 3])
;(def hashMapTest (hash-map :k1 "value1"))
;(def sortedMapTest (sorted-map :k2 "value2"))
;(def setTest (hash-set :a :b))
;(def sortedSetTest (sorted-set :a :b))

; coll? �ж��Ƿ��Ǽ�����
;(println
;  (coll? listTest)
;  (coll? vectorTest)
;  (coll? hashMapTest)
;  (coll? sortedMapTest)
;  (coll? setTest)
;  (coll? sortedSetTest))

;seq? �ж��Ƿ�����
;(println
;  (seq? listTest)
;  (seq? vectorTest)
;  (seq? hashMapTest)
;  (seq? sortedMapTest)
;  (seq? setTest)
;  (seq? sortedSetTest))

; range �� 0 ��ʼ��������
; take ȡǰ n ������,
;(println
;  (range 4)
;;  (range)
;  (take 6 (range))
;  (take 3 [1 2 5 6])
;;  (take 4)
;  (take-last 4 (range 12))
;  (take-nth 6 (range 20)))

; cons �����������б�ͷ���������
; conj ������β�������б�ͷ���������
; concat �ϲ����������б�, �ϲ���Ľ����Ϊ�б�
;(println
;  (cons 4 [1 2 3])
;  (cons 4 '(1 2 3))
;  (conj [1 2 3] 4)
;  (conj '(1 2 3) 4)
;  (concat [1 2] '(3 4))
;  (concat [1 2] [3 4]))

; inc �൱�� ++
; dec �൱�� --
; map �Լ�����ÿһ��ִ��һ�κ���
; even? �ж��Ƿ���ż��
; odd? �ж��Ƿ�������
;(println
;  (inc 1)
;  (map inc [1 2 3])
;  (map dec '(1 2 3))
;  (filter even? [1 2 3])
;  (filter odd? [1 2 3]))

; reduce ��ͣ����(������ô������, �� js �� reduce һ����, ��Ȼ js ����ѧ lisp ���� reduce)
;(println
;  (reduce + [1 2 3 4])
;  (reduce + 1 [2 3 4])
;  (reduce concat [] [[1 2] [3 4] [5 6] [7 8]]))



