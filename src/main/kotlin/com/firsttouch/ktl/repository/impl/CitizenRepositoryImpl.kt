package com.firsttouch.ktl.repository.impl

import com.firsttouch.ktl.model.CitizenDTO
import com.firsttouch.ktl.model.toCitizenDTO
import com.firsttouch.ktl.repository.CitizenRepository
import com.firsttouch.ktl.tables.references.CITIZEN
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class RecordsRepositoryImpl(private val dsl: DSLContext) : CitizenRepository {
    override suspend fun findAll(): List<CitizenDTO> = dsl.select().from(CITIZEN)
            .fetch {
                it.toCitizenDTO()
            }

    override suspend fun findById(id: Int): CitizenDTO? = dsl.select()
            .from(CITIZEN)
            .where(CITIZEN.ID.eq(id))
            .limit(1)
            .fetch()
            .map {
                it.toCitizenDTO()
            }
            .firstOrNull()

    override suspend fun findByMajorFields(citizen: CitizenDTO): List<CitizenDTO>? = dsl.select()
            .from(CITIZEN)
            .where(CITIZEN.FIRSTNAME.eq(citizen.firstName)
                    .and(CITIZEN.LASTNAME.eq(citizen.lastName))
                    .and(CITIZEN.PHONE.eq(citizen.phone)))
            .fetch()
            .map {
                it.toCitizenDTO()
            }

    override suspend fun insert(citizen: CitizenDTO) =
            dsl.insertInto(CITIZEN)
                    .set(CITIZEN.FIRSTNAME, citizen.firstName)
                    .set(CITIZEN.LASTNAME, citizen.lastName)
                    .set(CITIZEN.PHONE, citizen.phone)
                    .execute()
                    .let { findByMajorFields(citizen)?.firstOrNull() }

    override suspend fun update(citizenDto: CitizenDTO) =
            dsl.update(CITIZEN)
                    .set(CITIZEN.FIRSTNAME, citizenDto.firstName)
                    .set(CITIZEN.LASTNAME, citizenDto.lastName)
                    .set(CITIZEN.PHONE, citizenDto.phone)
                    .where(CITIZEN.ID.eq(citizenDto.id))
                    .execute()
                    .let { citizenDto.id?.let { it1 -> findById(it1) } }

    override suspend fun remove(id: Int) {
        dsl.delete(CITIZEN)
                .where(CITIZEN.ID.eq(id))
                .execute()
    }

    override suspend fun removeAll() {
        findAll().forEach {
            it.id?.let { it1 -> remove(it1) }
        }
    }
}
