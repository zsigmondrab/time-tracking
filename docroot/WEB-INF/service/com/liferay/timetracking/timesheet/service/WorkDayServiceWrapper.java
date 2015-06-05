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

package com.liferay.timetracking.timesheet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WorkDayService}.
 *
 * @author Laszlo Hudak, Istvan Sajtos
 * @see WorkDayService
 * @generated
 */
public class WorkDayServiceWrapper implements WorkDayService,
	ServiceWrapper<WorkDayService> {
	public WorkDayServiceWrapper(WorkDayService workDayService) {
		_workDayService = workDayService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _workDayService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_workDayService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _workDayService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.liferay.timetracking.timesheet.model.WorkDay addWorkDay(
		long userId, long companyId, long startTime, long endTime,
		long dayOfYearId, int break_,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workDayService.addWorkDay(userId, companyId, startTime,
			endTime, dayOfYearId, break_, serviceContext);
	}

	@Override
	public java.util.List<com.liferay.timetracking.timesheet.model.WorkDay> getWorkDays(
		long userId, long companyId, long startTime, long endTime, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workDayService.getWorkDays(userId, companyId, startTime,
			endTime, start, end, orderByComparator);
	}

	@Override
	public com.liferay.timetracking.timesheet.model.WorkDay updateWorkDay(
		long userId, long workDayId, long startTime, long endTime,
		long dayOfYearId, int break_,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workDayService.updateWorkDay(userId, workDayId, startTime,
			endTime, dayOfYearId, break_, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WorkDayService getWrappedWorkDayService() {
		return _workDayService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWorkDayService(WorkDayService workDayService) {
		_workDayService = workDayService;
	}

	@Override
	public WorkDayService getWrappedService() {
		return _workDayService;
	}

	@Override
	public void setWrappedService(WorkDayService workDayService) {
		_workDayService = workDayService;
	}

	private WorkDayService _workDayService;
}