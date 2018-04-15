package com.mchurner.service;

import com.mchurner.beans.ResponseBean;
import com.mchurner.beans.customer.FDAccountBean;

public interface CustAccountService {
	ResponseBean createFDAcc(FDAccountBean fdBean);
}
