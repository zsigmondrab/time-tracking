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

package com.liferay.timetracking.timesheet.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.liferay.timetracking.timesheet.service.WorkDayServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.timetracking.timesheet.service.WorkDayServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.timetracking.timesheet.model.WorkDaySoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.timetracking.timesheet.model.WorkDay}, that is translated to a
 * {@link com.liferay.timetracking.timesheet.model.WorkDaySoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Laszlo Hudak, Istvan Sajtos
 * @see WorkDayServiceHttp
 * @see com.liferay.timetracking.timesheet.model.WorkDaySoap
 * @see com.liferay.timetracking.timesheet.service.WorkDayServiceUtil
 * @generated
 */
public class WorkDayServiceSoap {
	public static com.liferay.timetracking.timesheet.model.WorkDaySoap addWorkDay(
		long userId, long companyId, long startTime, long endTime,
		long dayOfYearId, int break_,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.timetracking.timesheet.model.WorkDay returnValue = WorkDayServiceUtil.addWorkDay(userId,
					companyId, startTime, endTime, dayOfYearId, break_,
					serviceContext);

			return com.liferay.timetracking.timesheet.model.WorkDaySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.timetracking.timesheet.model.WorkDaySoap[] getWorkDays(
		long userId, long companyId, long startTime, long endTime, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws RemoteException {
		try {
			java.util.List<com.liferay.timetracking.timesheet.model.WorkDay> returnValue =
				WorkDayServiceUtil.getWorkDays(userId, companyId, startTime,
					endTime, start, end, orderByComparator);

			return com.liferay.timetracking.timesheet.model.WorkDaySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.timetracking.timesheet.model.WorkDaySoap updateWorkDay(
		long userId, long workDayId, long startTime, long endTime,
		long dayOfYearId, int break_,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.timetracking.timesheet.model.WorkDay returnValue = WorkDayServiceUtil.updateWorkDay(userId,
					workDayId, startTime, endTime, dayOfYearId, break_,
					serviceContext);

			return com.liferay.timetracking.timesheet.model.WorkDaySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(WorkDayServiceSoap.class);
}