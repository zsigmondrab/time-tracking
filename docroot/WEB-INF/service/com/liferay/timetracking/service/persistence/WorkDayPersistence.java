/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.timetracking.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.timetracking.model.WorkDay;

/**
 * The persistence interface for the work day service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Istvan Sajtos
 * @see WorkDayPersistenceImpl
 * @see WorkDayUtil
 * @generated
 */
public interface WorkDayPersistence extends BasePersistence<WorkDay> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WorkDayUtil} to access the work day persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the work day in the entity cache if it is enabled.
	*
	* @param workDay the work day
	*/
	public void cacheResult(com.liferay.timetracking.model.WorkDay workDay);

	/**
	* Caches the work daies in the entity cache if it is enabled.
	*
	* @param workDaies the work daies
	*/
	public void cacheResult(
		java.util.List<com.liferay.timetracking.model.WorkDay> workDaies);

	/**
	* Creates a new work day with the primary key. Does not add the work day to the database.
	*
	* @param workDayId the primary key for the new work day
	* @return the new work day
	*/
	public com.liferay.timetracking.model.WorkDay create(long workDayId);

	/**
	* Removes the work day with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workDayId the primary key of the work day
	* @return the work day that was removed
	* @throws com.liferay.timetracking.NoSuchWorkDayException if a work day with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.timetracking.model.WorkDay remove(long workDayId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.NoSuchWorkDayException;

	public com.liferay.timetracking.model.WorkDay updateImpl(
		com.liferay.timetracking.model.WorkDay workDay)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the work day with the primary key or throws a {@link com.liferay.timetracking.NoSuchWorkDayException} if it could not be found.
	*
	* @param workDayId the primary key of the work day
	* @return the work day
	* @throws com.liferay.timetracking.NoSuchWorkDayException if a work day with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.timetracking.model.WorkDay findByPrimaryKey(
		long workDayId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.NoSuchWorkDayException;

	/**
	* Returns the work day with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param workDayId the primary key of the work day
	* @return the work day, or <code>null</code> if a work day with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.timetracking.model.WorkDay fetchByPrimaryKey(
		long workDayId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the work daies.
	*
	* @return the work daies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.timetracking.model.WorkDay> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the work daies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.model.impl.WorkDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of work daies
	* @param end the upper bound of the range of work daies (not inclusive)
	* @return the range of work daies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.timetracking.model.WorkDay> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the work daies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.model.impl.WorkDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of work daies
	* @param end the upper bound of the range of work daies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of work daies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.timetracking.model.WorkDay> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the work daies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of work daies.
	*
	* @return the number of work daies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}