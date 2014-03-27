package org.stagemonitor.benchmark.profiler;

import org.stagemonitor.collector.profiler.ProfilingAspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestPerformanceMonitorAspect extends ProfilingAspect {

	@Pointcut("execution(* org.stagemonitor.benchmark.profiler.ClassToProfile.*(..))")
	public void methodsToProfile() {
	}
}