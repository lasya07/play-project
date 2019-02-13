package dao;

import models.Restaurant;
import play.db.jpa.JPAApi;

import javax.inject.Inject;


public class RestaurantDaoImpl implements RestaurantDao{

    final JPAApi jpaApi;

    @Inject
    public RestaurantDaoImpl(JPAApi jpaApi) {

        this.jpaApi = jpaApi;

    }


    public Restaurant create(Restaurant restaurant) {

        if(null == restaurant) {
            throw new IllegalArgumentException("Book must be provided");
        }

        jpaApi.em().persist(restaurant);

        return restaurant;

    }

    @Override
    public Restaurant update(Restaurant restaurant) {
        return null;
    }

}