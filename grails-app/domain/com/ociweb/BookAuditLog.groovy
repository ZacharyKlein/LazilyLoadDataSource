package com.ociweb

class BookAuditLog {

    String event
    String title
    Date dateCreated

    static constraints = {
    }

    static mapping = {
        datasource 'secondaryDataSource'
    }

}
