package com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.domain.Product;
import com.util.HibernateUtil;

public class ProductDaoImpl implements IProductDao {

	@Override
	public int save(Product product) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = null;
		Transaction tx = null;

		int id;
		try {

			session = factory.openSession();

			tx = session.beginTransaction();

			id = (Integer) session.save(product);

			tx.commit();
		} catch (HibernateException ex) {

			tx.rollback();
			throw ex;
		} finally {

			if (session != null) {

				session.close();
			}
		}

		return id;
	}

	@Override
	public void update(Product product) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = null;
		Transaction tx = null;

		try {

			session = factory.openSession();

			tx = session.beginTransaction();

			session.saveOrUpdate(product);

			tx.commit();
		} catch (HibernateException ex) {

			tx.rollback();
			throw ex;
		} finally {

			if (session != null) {

				session.close();
			}
		}

	}

	@Override
	public void delete(int id) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = null;
		Transaction tx = null;

		try {

			session = factory.openSession();

			tx = session.beginTransaction();

			Product product = (Product) session.get(Product.class, id);
			session.delete(product);

			tx.commit();
		} catch (HibernateException ex) {

			tx.rollback();
			throw ex;
		} finally {

			if (session != null) {

				session.close();
			}
		}
	}

	@Override
	public Product getProductById(int id) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = null;
		Product product = null;
		try {

			session = factory.openSession();
			product = (Product) session.get(Product.class, id);
			
		} catch (HibernateException ex) {
			
			throw ex;
		} finally {

			if (session != null) {

				session.close();
			}
		}
		return product;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = null;
		List<Product> products = null;
		try {

			session = factory.openSession();

			Query query = session.createQuery("from com.domain.Product");
			products = query.list();
			
		} catch (HibernateException ex) {

			throw ex;
		} finally {

			if (session != null) {

				session.close();
			}
		}
		return products;
	}

}
