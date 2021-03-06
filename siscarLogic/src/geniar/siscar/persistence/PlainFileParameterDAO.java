package geniar.siscar.persistence;

import geniar.siscar.model.PlainFileParameter;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * PlainFileParameter entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see geniar.siscar.model.PlainFileParameter
 * @author MyEclipse Persistence Tools
 */

public class PlainFileParameterDAO implements IPlainFileParameterDAO {
	// property constants
	public static final String PFP_CONCEPTONOMINA = "pfpConceptonomina";
	public static final String PFP_DESCRIPCION = "pfpDescripcion";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved PlainFileParameter
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * PlainFileParameterDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            PlainFileParameter entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(PlainFileParameter entity) {
		EntityManagerHelper.log("saving PlainFileParameter instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent PlainFileParameter entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * PlainFileParameterDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            PlainFileParameter entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(PlainFileParameter entity) {
		EntityManagerHelper.log("deleting PlainFileParameter instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(PlainFileParameter.class, entity.getPfpId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved PlainFileParameter entity and return it or a
	 * copy of it to the sender. A copy of the PlainFileParameter entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = PlainFileParameterDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            PlainFileParameter entity to update
	 * @returns PlainFileParameter the persisted PlainFileParameter entity
	 *          instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public PlainFileParameter update(PlainFileParameter entity) {
		EntityManagerHelper.log("updating PlainFileParameter instance", Level.INFO, null);
		try {
			PlainFileParameter result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public PlainFileParameter findById(Long id) {
		EntityManagerHelper.log("finding PlainFileParameter instance with id: " + id, Level.INFO, null);
		try {
			PlainFileParameter instance = getEntityManager().find(PlainFileParameter.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all PlainFileParameter entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the PlainFileParameter property to query
	 * @param value
	 *            the property value to match
	 * @return List<PlainFileParameter> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<PlainFileParameter> findByProperty(String propertyName, final Object value) {
		EntityManagerHelper.log("finding PlainFileParameter instance with property: " + propertyName + ", value: "
				+ value, Level.INFO, null);
		try {
			final String queryString = "select model from PlainFileParameter model where model." + propertyName
					+ "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<PlainFileParameter> findByPfpConceptonomina(Object pfpConceptonomina) {
		return findByProperty(PFP_CONCEPTONOMINA, pfpConceptonomina);
	}

	public List<PlainFileParameter> findByPfpDescripcion(Object pfpDescripcion) {
		return findByProperty(PFP_DESCRIPCION, pfpDescripcion);
	}

	/**
	 * Find all PlainFileParameter entities.
	 * 
	 * @return List<PlainFileParameter> all PlainFileParameter entities
	 */
	@SuppressWarnings("unchecked")
	public List<PlainFileParameter> findAll() {
		EntityManagerHelper.log("finding all PlainFileParameter instances", Level.INFO, null);
		try {
			final String queryString = "select model from PlainFileParameter model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}