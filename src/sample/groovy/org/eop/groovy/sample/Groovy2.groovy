package org.eop.groovy.sample

/**
 * @author lixinjie
 */
class Groovy2 {

	static main(args) {
		println 'import时使用as关键字指定别名，可以解决命名冲突的问题，import java.sql.Date as SqlDate'
		println 'line 667 of groovy.txt---------------------------------'
		def (a, b, c) = [1, 2, 3]
		println a
		println b
		println c
		def (_, e) = [1, 2, 3, 4]
		println _
		println e
		def (g, h) = [1]
		println g
		println h
	}

}
