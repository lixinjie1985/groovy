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
	}
}
