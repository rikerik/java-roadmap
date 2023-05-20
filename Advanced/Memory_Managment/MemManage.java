package Memory_Managment;

//There are four types of references: Strong, Weak, Soft, and Phantom reference.
//The difference among the types of references is that the objects on the heap
//they refer to are eligible for garbage collecting under the different criteria.

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class MemManage {
    public static void main(String[] args) {
        //Strong reference: It is very simple as we use it in our daily programming.
        //Any object which has Strong reference attached to it is not eligible for garbage collection.
        //We can create a strong reference by using the following statement:
        StringBuilder sb = new StringBuilder();

        /*
        Weak Reference: It does not survive after the next garbage collection process.
        If we are not sure when the data will be requested again. In this condition,
        we can create a weak reference to it. In case, if the garbage collector processes,
        it destroys the object. When we again try to retrieve that object, we get a null value.
        It is defined in java.lang.ref.WeakReference class. We can create a weak reference by
        using the following statement:
         */
        WeakReference<StringBuilder> weakReference = new WeakReference<>(new StringBuilder());

        //Soft Reference: It is collected when the application is running low on memory.
        //The garbage collector does not collect the softly reachable objects.
        //All soft referenced object s are collected before it throws an OutOfMemoryError.
        //We can create a soft reference by using the following statement:
        SoftReference<StringBuilder> softReference = new SoftReference<>(new StringBuilder());

        //Phantom Reference: It is available in java.lang.ref package.
        //It is defined in java.lang.ref.PhantomReference class.
        //The object which has only phantom reference pointing them can be collected whenever
        //garbage collector wants to collect. We can create a phantom reference by using the following statement:
        PhantomReference<StringBuilder> phantomReference = new PhantomReference<>(new StringBuilder(),null);

        //when we create a PhantomReference object with new PhantomReference<>(new StringBuilder(), null),
        //it means that we are passing a StringBuilder object as the reference and null as the ReferenceQueue.
        //This implies that the PhantomReference object is not associated with any ReferenceQueue,
        // nd we will not receive any notifications about the "phantom reference" becoming unreachable.
    }

}
