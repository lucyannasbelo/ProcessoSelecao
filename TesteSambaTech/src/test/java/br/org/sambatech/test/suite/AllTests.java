package br.org.sambatech.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.org.sambatech.test.BaseTestCase;
import br.org.sambatech.test.ContentTest;
import br.org.sambatech.test.HeaderTest;
import br.org.sambatech.test.LoginTestFail;
import br.org.sambatech.test.LoginTestSuccess;
import br.org.sambatech.test.UploadTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	LoginTestFail.class,
	LoginTestSuccess.class,
	HeaderTest.class,
	UploadTest.class,
	ContentTest.class,	
	})
public class AllTests extends BaseTestCase
{

}
