package org.eop.groovy.sample

/**
 * @author lixinjie
 */
class Groovy1 {

	static main(args) {
		println '单引号单行字符串，和Java字符串一样，不支持插值'
		println '''多行字符串，
					和Java一样，
			不支持插值'''
		println '字符串' + '相' + '加'
		println "双引号字符串，如果没有插值表达式，就是Java字符串，如果有插值表达式，就是GString"
		println "插值表达式${2 + 3}"
		def name = '李新杰'
		println "插值表达式${name}"
		println "插值闭包表达式，包含一个箭头${-> 2017}，${->'无参插值闭包表达式'}"
		println "插值闭包表达式，包含一个箭头${year -> year}，${->'带参插值闭包表达式'}"
		def num = 5
		def exp1 = "此时（定义表达式时）就计算值，以后改变值无影响，此时值是5：${num}"
		num = 10
		def exp2 = "此时（定义表达式时）就计算值，以后改变值无影响，此时值是10：${num}"
		num = 15
		println exp1
		println exp2
		println "普通插值表达式，是积极计算的，定义时就计算"
		def exp3 = "此时（定义表达式时）不计算值，以后改变值有影响，此时值是15：${->num}"
		num = 20
		println exp3
		println "闭包插值表达式，是延迟结算的，在调用时才计算"
		println """${name}
			${->num}
		多行的"""
		println 'groovy中没有字符的概念，不过还是可以声明的，如下'
		def c = 'd'
		char c1 = 'a'
		def c2 = 'b' as char
		def c3 = (char)'c'
		println c.class
		println c1.class
		println c2.class
		println c3.class
		println 'groovy中，整数默认是Integer类型，小数默认是BigDecimal'
		def _defInt = 10
		def _bigInt = 10G
		def _long = 10L
		def _int = 10i
		def _defDec = 10.1
		def _bigDec = 10.1G
		def _double = 10.1D
		def _float = 10.1F
		println _defInt.class
		println _bigInt.class
		println _long.class
		println _int.class
		println _defDec.class
		println _bigDec.class
		println _double.class
		println _float.class
		println '算术运算时，整型之间结果和较大类型的一样'
		println '算术运算时，有小数参与时，带有float或double的结果都是double'
		println '算术运算时，有小数参与时，不带有float或double的结果都是BigDecimal'
		println '除法操作符，操作数中如果有float或double，结果就是double，除此之外，结果都是BigDecimal'
		println '布尔类型，只有true和false，Groovy有特别的规则可以强制非布尔对象到一个布尔值'
		
		def ll = []
		println ll.class
		def lll = [] as LinkedList
		println lll.class
		LinkedList llll = []
		println llll.class
		def l = [1, 2, 3]
		println l[0]
		println l[-1]
		l[1] = 9
		println l
		l << 4
		println l
		def muti = [[1],[2]]
		println muti.class
		println muti[0].class
		println muti[0][-1].class
		println '要想成为数组必须显式指定，通过强制类型或显式类型声明'
		int[] ia = [1]
		def ia0 = [1] as int[]
		println ia.class
		println ia0.class
		def mp = ['key':'value']
		println mp['key']
		println mp.key
		println mp.getClass()
		println mp.class
		mp.key1 = 'value1'
		mp.key = 'valuevalue'
		println mp
		println mp.containsKey('key1')
	}
}
