package de.example;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@LocalBean
public class SessionBean {
  @PersistenceContext(name = "neo4j-ogm")
  private EntityManager em;
}
