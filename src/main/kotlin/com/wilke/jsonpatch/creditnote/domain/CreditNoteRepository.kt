package com.wilke.jsonpatch.creditnote.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface CreditNoteRepository : JpaRepository<CreditNote, Long>
