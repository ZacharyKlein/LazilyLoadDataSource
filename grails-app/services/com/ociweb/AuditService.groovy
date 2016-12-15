package com.ociweb

import grails.transaction.Transactional

@Transactional
class AuditService {

    def logInsert(String title) {
        try {
            new BookAuditLog(event: 'Insert', title: title, dateCreated: new Date()).save flush: true
        } catch (e) {
            log.warn e
        }
    }

    def logUpdate(String title) {
        try {
            new BookAuditLog(event: 'Update', title: title, dateCreated: new Date()).save flush: true
        } catch (e) {
            log.warn e
        }
    }
}
