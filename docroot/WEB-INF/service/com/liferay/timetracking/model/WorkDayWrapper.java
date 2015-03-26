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

package com.liferay.timetracking.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WorkDay}.
 * </p>
 *
 * @author Istvan Sajtos
 * @see WorkDay
 * @generated
 */
public class WorkDayWrapper implements WorkDay, ModelWrapper<WorkDay> {
	public WorkDayWrapper(WorkDay workDay) {
		_workDay = workDay;
	}

	@Override
	public Class<?> getModelClass() {
		return WorkDay.class;
	}

	@Override
	public String getModelClassName() {
		return WorkDay.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("workDayId", getWorkDayId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("dayOfYearId", getDayOfYearId());
		attributes.put("userId", getUserId());
		attributes.put("startTime", getStartTime());
		attributes.put("endTime", getEndTime());
		attributes.put("lunchBreak", getLunchBreak());
		attributes.put("timestamp", getTimestamp());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long workDayId = (Long)attributes.get("workDayId");

		if (workDayId != null) {
			setWorkDayId(workDayId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long dayOfYearId = (Long)attributes.get("dayOfYearId");

		if (dayOfYearId != null) {
			setDayOfYearId(dayOfYearId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer startTime = (Integer)attributes.get("startTime");

		if (startTime != null) {
			setStartTime(startTime);
		}

		Integer endTime = (Integer)attributes.get("endTime");

		if (endTime != null) {
			setEndTime(endTime);
		}

		Integer lunchBreak = (Integer)attributes.get("lunchBreak");

		if (lunchBreak != null) {
			setLunchBreak(lunchBreak);
		}

		Date timestamp = (Date)attributes.get("timestamp");

		if (timestamp != null) {
			setTimestamp(timestamp);
		}
	}

	/**
	* Returns the primary key of this work day.
	*
	* @return the primary key of this work day
	*/
	@Override
	public long getPrimaryKey() {
		return _workDay.getPrimaryKey();
	}

	/**
	* Sets the primary key of this work day.
	*
	* @param primaryKey the primary key of this work day
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_workDay.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the work day ID of this work day.
	*
	* @return the work day ID of this work day
	*/
	@Override
	public long getWorkDayId() {
		return _workDay.getWorkDayId();
	}

	/**
	* Sets the work day ID of this work day.
	*
	* @param workDayId the work day ID of this work day
	*/
	@Override
	public void setWorkDayId(long workDayId) {
		_workDay.setWorkDayId(workDayId);
	}

	/**
	* Returns the group ID of this work day.
	*
	* @return the group ID of this work day
	*/
	@Override
	public long getGroupId() {
		return _workDay.getGroupId();
	}

	/**
	* Sets the group ID of this work day.
	*
	* @param groupId the group ID of this work day
	*/
	@Override
	public void setGroupId(long groupId) {
		_workDay.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this work day.
	*
	* @return the company ID of this work day
	*/
	@Override
	public long getCompanyId() {
		return _workDay.getCompanyId();
	}

	/**
	* Sets the company ID of this work day.
	*
	* @param companyId the company ID of this work day
	*/
	@Override
	public void setCompanyId(long companyId) {
		_workDay.setCompanyId(companyId);
	}

	/**
	* Returns the day of year ID of this work day.
	*
	* @return the day of year ID of this work day
	*/
	@Override
	public long getDayOfYearId() {
		return _workDay.getDayOfYearId();
	}

	/**
	* Sets the day of year ID of this work day.
	*
	* @param dayOfYearId the day of year ID of this work day
	*/
	@Override
	public void setDayOfYearId(long dayOfYearId) {
		_workDay.setDayOfYearId(dayOfYearId);
	}

	/**
	* Returns the user ID of this work day.
	*
	* @return the user ID of this work day
	*/
	@Override
	public long getUserId() {
		return _workDay.getUserId();
	}

	/**
	* Sets the user ID of this work day.
	*
	* @param userId the user ID of this work day
	*/
	@Override
	public void setUserId(long userId) {
		_workDay.setUserId(userId);
	}

	/**
	* Returns the user uuid of this work day.
	*
	* @return the user uuid of this work day
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workDay.getUserUuid();
	}

	/**
	* Sets the user uuid of this work day.
	*
	* @param userUuid the user uuid of this work day
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_workDay.setUserUuid(userUuid);
	}

	/**
	* Returns the start time of this work day.
	*
	* @return the start time of this work day
	*/
	@Override
	public int getStartTime() {
		return _workDay.getStartTime();
	}

	/**
	* Sets the start time of this work day.
	*
	* @param startTime the start time of this work day
	*/
	@Override
	public void setStartTime(int startTime) {
		_workDay.setStartTime(startTime);
	}

	/**
	* Returns the end time of this work day.
	*
	* @return the end time of this work day
	*/
	@Override
	public int getEndTime() {
		return _workDay.getEndTime();
	}

	/**
	* Sets the end time of this work day.
	*
	* @param endTime the end time of this work day
	*/
	@Override
	public void setEndTime(int endTime) {
		_workDay.setEndTime(endTime);
	}

	/**
	* Returns the lunch break of this work day.
	*
	* @return the lunch break of this work day
	*/
	@Override
	public int getLunchBreak() {
		return _workDay.getLunchBreak();
	}

	/**
	* Sets the lunch break of this work day.
	*
	* @param lunchBreak the lunch break of this work day
	*/
	@Override
	public void setLunchBreak(int lunchBreak) {
		_workDay.setLunchBreak(lunchBreak);
	}

	/**
	* Returns the timestamp of this work day.
	*
	* @return the timestamp of this work day
	*/
	@Override
	public java.util.Date getTimestamp() {
		return _workDay.getTimestamp();
	}

	/**
	* Sets the timestamp of this work day.
	*
	* @param timestamp the timestamp of this work day
	*/
	@Override
	public void setTimestamp(java.util.Date timestamp) {
		_workDay.setTimestamp(timestamp);
	}

	@Override
	public boolean isNew() {
		return _workDay.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_workDay.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _workDay.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_workDay.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _workDay.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _workDay.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_workDay.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _workDay.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_workDay.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_workDay.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_workDay.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WorkDayWrapper((WorkDay)_workDay.clone());
	}

	@Override
	public int compareTo(WorkDay workDay) {
		return _workDay.compareTo(workDay);
	}

	@Override
	public int hashCode() {
		return _workDay.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<WorkDay> toCacheModel() {
		return _workDay.toCacheModel();
	}

	@Override
	public WorkDay toEscapedModel() {
		return new WorkDayWrapper(_workDay.toEscapedModel());
	}

	@Override
	public WorkDay toUnescapedModel() {
		return new WorkDayWrapper(_workDay.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _workDay.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _workDay.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_workDay.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WorkDayWrapper)) {
			return false;
		}

		WorkDayWrapper workDayWrapper = (WorkDayWrapper)obj;

		if (Validator.equals(_workDay, workDayWrapper._workDay)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public WorkDay getWrappedWorkDay() {
		return _workDay;
	}

	@Override
	public WorkDay getWrappedModel() {
		return _workDay;
	}

	@Override
	public void resetOriginalValues() {
		_workDay.resetOriginalValues();
	}

	private WorkDay _workDay;
}