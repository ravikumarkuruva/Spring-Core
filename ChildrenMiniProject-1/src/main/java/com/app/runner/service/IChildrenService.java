package com.app.runner.service;

import com.app.runner.entity.Children;

public interface IChildrenService {
	public Integer saveChild(Children c);
	public void deleteChild(Integer id);
	public void updateChild(Integer id, Children c);
	public Children getChildById(Integer id);
}
