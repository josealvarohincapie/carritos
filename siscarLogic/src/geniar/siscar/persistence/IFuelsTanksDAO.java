package geniar.siscar.persistence;

import geniar.siscar.model.FuelTanks;

import java.util.List;

/**
 * Interface for FuelsTanksDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IFuelsTanksDAO {
	/**
	 * Perform an initial save of a previously unsaved FuelsTanks entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IFuelsTanksDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            FuelsTanks entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(FuelTanks entity);

	/**
	 * Delete a persistent FuelsTanks entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IFuelsTanksDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            FuelsTanks entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(FuelTanks entity);

	/**
	 * Persist a previously saved FuelsTanks entity and return it or a copy of
	 * it to the sender. A copy of the FuelsTanks entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IFuelsTanksDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            FuelsTanks entity to update
	 * @returns FuelsTanks the persisted FuelsTanks entity instance, may not be
	 *          the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public FuelTanks update(FuelTanks entity);

	public FuelTanks findById(Long id);

	/**
	 * Find all FuelTanks entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the FuelTanks property to query
	 * @param value
	 *            the property value to match
	 * @return List<FuelTanks> found by query
	 */
	public List<FuelTanks> findByProperty(String propertyName, Object value);

	public List<FuelTanks> findByFtaNombre(Object ftaNombre);

	public List<FuelTanks> findByFtaCapacidadMaxima(Object ftaCapacidadMaxima);

	public List<FuelTanks> findByFtaGalonesSuministrados(Object ftaGalonesSuministrados);

	public List<FuelTanks> findByFtaTotalCombustible(Object ftaTotalCombustible);

	/**
	 * Find all FuelTanks entities.
	 * 
	 * @return List<FuelTanks> all FuelTanks entities
	 */
	public List<FuelTanks> findAll();
}