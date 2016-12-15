package com.ociweb

class Book {

    def auditService

    String title

    static constraints = {
    }


    def afterInsert() {
        auditService.logInsert(title)
    }

    def afterUpdate() {
        auditService.logUpdate(title)
    }
}
