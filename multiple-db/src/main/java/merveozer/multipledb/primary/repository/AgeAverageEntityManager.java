package merveozer.multipledb.primary.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import merveozer.multipledb.helper.EntityManagerLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AgeAverageEntityManager {
    @Autowired
    private EntityManagerLocator entityManagerLocator;

    @Transactional("primaryTransactionManager")
    public void calculateAgeAverage(){
        EntityManager entityManager = entityManagerLocator.getEntityManager("primaryEntityManagerFactory");
        EntityTransaction transactionManager = entityManager.getTransaction();
        transactionManager.begin();
        String query = "INSERT INTO age_average (age_avg) SELECT AVG(age) from user_info";
        entityManager.createNativeQuery(query).executeUpdate();
        transactionManager.commit();
    }
}
